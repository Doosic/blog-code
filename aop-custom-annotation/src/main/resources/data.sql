-- 역할 INSERT
INSERT INTO role (reg_user_id, auth_name, role_type)
VALUES (1, 'MASTER', 'AUTH');

-- 사용자 INSERT
INSERT INTO admin (role_id, email, name, password, status)
VALUES (1, 'suadoosic@naver.com', 'suadoosic', 'test1234', 'USE');

-- 권한 INSERT
INSERT INTO auth (auth_cd, auth_parent, auth_name, menu_type_code)
VALUES ('BOARD-READ', -1, '게시물 조회', 'ITEM');

-- todo role과 auth의 매핑 테이블 필요