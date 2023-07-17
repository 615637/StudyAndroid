--JOIN의 종류 3
--INNER JOIN A n B <- 교집합을 가져옴
--LEFT RIGHT OUTER JOIN <- (A n B) U (A - B) : inner join은 null을 제외, outer join은 null을 포함
--FULL JOIN : 의미 없는 정보값까지 다 가져옴

--[INNER or OUTER or FULL] [JOIN] ON key=key, 조건=조건
select e.*, d.*, l.*, r.*
from employees e left outer join departments d on e.department_id = d.department_id
                 left outer join locations l on d.location_id = l.location_id
                 left outer join countries c on c.country_id = l.country_id
                 left outer join regions r on r.region_id = c.region_id;
-- from employees e inner join departments d on e.employee_id = d.department_name; join이 정확이 안되어서 결과 출력 안됨