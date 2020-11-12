Commit 1
https://www.youtube.com/watch?v=jH17YkBTpI4&list=PLU2ftbIeotGoGSEUf54LQH-DgiQPF2XRO

Commit 2 JPA (Hibernate)
https://www.youtube.com/watch?v=nyFLX3q3poY&list=PLU2ftbIeotGoGSEUf54LQH-DgiQPF2XRO&index=2
https://spring.io/guides/gs/accessing-data-mysql/
Руководство по мусташ http://mustache.github.io/mustache.5.html
Руководство по Spring JPA https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html#jpa.query-methods.query-creation

В БД вылезла ошбика связанная с временными зонами. Решил "set global time_zone = '-2:00'"; в sql. Возможно правильнее было переписать бин.

В настройках подключения БД указываем `spring.jpa.generate-dll=true` Это означает что структуру БД будет создавать сам спринг.

В репозитории (MessageRepo.java) создаем метод List<Message> findByTag(String tag); SpringJPA сам преобразует его в правильный запрос. Все подробности выше по ссылке.
