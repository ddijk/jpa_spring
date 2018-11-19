insert into person (name, age) values ( 'patricia', 40);


insert into plugin (name) values ('osiris');
insert into plugin (name) values ('trajectplanner');

insert into config (plugin_id, name, value) values ((select id from plugin where name='osiris'), 'url','http://xyz');
insert into config (plugin_id, name, value) values ((select id from plugin where name='osiris'),, 'username','aap');

insert into config (plugin_id, name, value) values ((select id from plugin where name='trajectplanner'), 'frankrijk','parijs');
insert into config (plugin_id, name, value) values ((select id from plugin where name='trajectplanner'), 'nederland','amsterdam');
insert into config (plugin_id, name, value) values ((select id from plugin where name='trajectplanner'), 'engeland','london');