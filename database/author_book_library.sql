CREATE TABLE `author` (
  `author_id` bigint PRIMARY KEY AUTO_INCREMENT,
  `author_code` varchar(100),
  `first_name` varchar(100),
  `last_name` varchar(100),
  `gender` varchar(30),
  `created_at` timestamp
);

CREATE TABLE `book` (
  `book_id` bigint PRIMARY KEY AUTO_INCREMENT,
  `isbn` varchar(17),
  `title` varchar(255),
  `published_date` datetime,
  `created_at` timestamp
);

CREATE TABLE `publisher` (
  `publisher_id` bigint PRIMARY KEY AUTO_INCREMENT,
  `publisher_name` varchar(500),
  `created_at` timestamp
);

CREATE TABLE `book_publisher` (
  `book_id` bigint,
  `publisher_id` bigint
);

CREATE TABLE `author_book` (
  `book_id` bigint,
  `author_id` bigint
);

ALTER TABLE `book_publisher` ADD FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`);

ALTER TABLE `book_publisher` ADD FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`publisher_id`);

ALTER TABLE `author_book` ADD FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`);

ALTER TABLE `author_book` ADD FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`);
