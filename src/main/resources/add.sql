-- Accounts
insert into account (email, first_name, last_name, password, role_id, modified_date, created_date)
values ('a.fon@gmail.com', 'art', 'fon', 'password', 2, CURRENT_DATE, CURRENT_DATE);

-- Words
insert into word (word, transcription, translate, translate_type, modified_date, created_date)
values ('Hi', '[?]', 'Привет', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE);

insert into word (word, transcription, translate, translate_type, modified_date, created_date)
values ('Yes', '[?]', 'Да', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE);

insert into word (word, transcription, translate, translate_type, modified_date, created_date)
values ('No', '[?]', 'Нет', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE);

insert into word (word, transcription, translate, translate_type, modified_date, created_date)
values ('Ok', '[?]', 'Хорошо', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE);

insert into word (word, transcription, translate, translate_type, modified_date, created_date)
values ('Sorry', '[?]', 'Простите', 'ENGLISH_RUSSIAN', CURRENT_DATE, CURRENT_DATE);

-- Rating
insert into word_rating (account_id, word_id, rating)
values (1, 1, 80);

insert into word_rating (account_id, word_id, rating)
values (1, 2, 100);

insert into word_rating (account_id, word_id, rating)
values (1, 3, 50);

-- List
insert into list_word (account_id, counter, "translateType")
values (1, 4, 'ENGLISH_RUSSIAN');

-- List-info
insert into list_word_info (list_word_id, word_id, counter)
values (1, 1, 0);

insert into list_word_info (list_word_id, word_id, counter)
values (1, 2, 0);

insert into list_word_info (list_word_id, word_id, counter)
values (1, 3, 0);