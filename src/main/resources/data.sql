insert into customer values
('1234567890', 'Jeffrey', '23 Green Lane', '55501'),
('3479319285', 'John', '512 Evergreen Dr', '55501'),
('8479231985', 'Arianna', '384 Leavenworth St', '55502'),
('7662324589', 'Junhan', '49 Ironwood Dr', '55503'),
('3812223456', 'Marlon', '54 Guatemala St','55504');

insert into employee values
(default, 'Part-time', 'Kevin Ramos'),
(default, 'Part-time', 'Christopher Rogers'),
(default, 'Inactive', 'Elana Danseglio'),
(default, 'Full-time', 'Hans Vidaure');

insert into product values 
(default, 'Large Buffalo Chicken Pizza', 15.50),
(default, 'Small Hawaiian Pizza', 12.50),
(default, 'Buffalo Wings', 10.75),
(default, 'Medium Pepperoni Pizza', 14.00),
(default, 'Soda', 2.50),
(default, '6 pc Garlic Knots', 6.75),
(default, 'Chicken Alfredo', 13.50),
(default, 'Mozarella Sticks', 6.75),
(default, '6 pc Rice Balls', 5.75);

insert into customer_order values
(default, 7662324589, 4),
(default, 3479319285, 1),
(default, 1234567890, 4),
(default, 1234567890, 3);

insert into order_details values
(10003, 1, 32.64, '2000-12-24 08:24:00'),
(10004, 2, 21.13, '2001-04-30 05:02:00'),
(10005, 3, 25.95, '2003-10-24 12:11:00'),
(10006, 4, 15.25, '2001-12-24 05:45:00');

insert into order_list values
(default, 10003, 1, 1),
(default, 10003, 2, 1),
(default, 10003, 5, 1),
(default, 10004, 5, 1),
(default, 10004, 9, 1),
(default, 10005, 3, 1),
(default, 10005, 7, 1),
(default, 10006, 5, 3),
(default, 10006, 8, 1);