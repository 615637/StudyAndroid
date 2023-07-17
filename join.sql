--JOIN�� ���� 3
--INNER JOIN A n B <- �������� ������
--LEFT RIGHT OUTER JOIN <- (A n B) U (A - B) : inner join�� null�� ����, outer join�� null�� ����
--FULL JOIN : �ǹ� ���� ���������� �� ������

--[INNER or OUTER or FULL] [JOIN] ON key=key, ����=����
select e.*, d.*, l.*, r.*
from employees e left outer join departments d on e.department_id = d.department_id
                 left outer join locations l on d.location_id = l.location_id
                 left outer join countries c on c.country_id = l.country_id
                 left outer join regions r on r.region_id = c.region_id;
-- from employees e inner join departments d on e.employee_id = d.department_name; join�� ��Ȯ�� �ȵǾ ��� ��� �ȵ�