-- mysql 根据表名转为java类，将数据库字段下划线转驼峰，带注释，常用类型匹配
select concat(
    '/** ',
    COLUMN_COMMENT,
    ' */',
    'private ',
    (case DATA_TYPE
        when 'int' then 'Integer '
        when 'bigint' then 'Integer '
        when 'double' then 'double '
        when 'float' then 'double '
        else 'String '
        end),
    leftstr,
    if(leftstr = '',SUBSTRING(rightstr,1,1),UPPER(SUBSTRING(rightstr,1,1))),
    SUBSTRING(rightstr,2,length(rightstr)),
    ';'
) as java_variable
from (
    select 
        ORDINAL_POSITION,
        substr(COLUMN_NAME,1,instr(COLUMN_NAME,'_')-1) leftstr,
        substr(COLUMN_NAME,instr(COLUMN_NAME,'_'    )+1,
        length(COLUMN_NAME)-instr(COLUMN_NAME,'_')) rightstr,
        DATA_TYPE,
        COLUMN_COMMENT 
    from information_schema.COLUMNS 
        where table_name = 't_ums_user' and table_schema='trigger'
) new_column order by ORDINAL_POSITION;