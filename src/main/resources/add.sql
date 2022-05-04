-- Accounts
insert into account (email, first_name, last_name, password, role_id, modified_date, created_date)
values ('a.fon@gmail.com', 'art', 'fon', 'password', 2, CURRENT_DATE, CURRENT_DATE);

-- Words
insert into word (word, transcription, translate, translate_type, modified_date, created_date, verified)
values ('Hi', '[?]', 'Привет', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE, true);

insert into word (word, transcription, translate, translate_type, modified_date, created_date, verified)
values ('Yes', '[?]', 'Да', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE, true);

insert into word (word, transcription, translate, translate_type, modified_date, created_date, verified)
values ('No', '[?]', 'Нет', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE, true);

insert into word (word, transcription, translate, translate_type, modified_date, created_date, verified)
values ('Ok', '[?]', 'Хорошо', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE, true);

insert into word (word, transcription, translate, translate_type, modified_date, created_date, verified)
values ('Sorry', '[?]', 'Простите', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE, true);

-- Rating
insert into word_rating (account_id, word_id, rating, modified_date, created_date)
values (1, 1, 80, CURRENT_DATE, CURRENT_DATE);

insert into word_rating (account_id, word_id, rating, modified_date, created_date)
values (1, 2, 100, CURRENT_DATE, CURRENT_DATE);

insert into word_rating (account_id, word_id, rating, modified_date, created_date)
values (1, 3, 50, CURRENT_DATE, CURRENT_DATE);

-- List
insert into list_word (account_id, counter, translate_type, name, modified_date, created_date)
values (1, 4, 'ENGLISH_RUSSIAN', 'first list',CURRENT_DATE, CURRENT_DATE);

-- List-info
insert into list_word_info (list_word_id, word_id, counter, modified_date, created_date)
values (1, 1, 0, CURRENT_DATE, CURRENT_DATE);

insert into list_word_info (list_word_id, word_id, counter, modified_date, created_date)
values (1, 2, 0, CURRENT_DATE, CURRENT_DATE);

insert into list_word_info (list_word_id, word_id, counter, modified_date, created_date)
values (1, 3, 0, CURRENT_DATE, CURRENT_DATE);