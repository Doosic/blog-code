-- 역할 INSERT
INSERT INTO role (reg_user_id, auth_name, role_type)
VALUES (0, 'MASTER', 'AUTH');

-- 사용자 INSERT
INSERT INTO admin (role_id, email, name, password, status)
VALUES (0, 'suadoosic@naver.com', 'suadoosic', 'test1234', 'USE');

-- 권한 INSERT
INSERT INTO auth (auth_cd, auth_parent, auth_name, menu_type_code)
VALUES ('BOARD', -1, '게시물', 'TREE');
INSERT INTO auth (auth_cd, auth_parent, auth_name, menu_type_code)
VALUES ('BOARD-READ', 'BOARD', '게시물 조회', 'ITEM');