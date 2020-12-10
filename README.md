# WT-Lab
WT PROJECT LAB 5 SEM ONLINE SHOP
#  Описание Spring boot

  Авторы Spring решили предоставить разработчикам некоторые утилиты, которые автоматизируют процедуру настройки и ускоряют процесс создания и развертывания Spring-приложений, под общим названием Spring Boot
 
  Spring Boot — это полезный проект, целью которого является упрощение создания приложений на основе Spring. Он позволяет наиболее простым способом создать web-приложение, требуя от разработчиков минимум усилий по его настройке и написанию кода
  Особенности Spring Boot
  Spring Boot обладает большим функционалом, но его наиболее значимыми особенностями являются: управление зависимостями, автоматическая конфигурация и встроенные контейнеры сервлетов
  Простота управления зависимостями
  Чтобы ускорить процесс управления зависимостями, Spring Boot неявно упаковывает необходимые сторонние зависимости для каждого типа приложения на основе Spring и предоставляет их разработчику посредством так называемых starter-пакетов (spring-boot-starter-web, spring-boot-starter-data-jpa и т.д.)
  Starter-пакеты представляют собой набор удобных дескрипторов зависимостей, которые можно включить в свое приложение. Это позволит получить универсальное решение для всех, связанных со Spring технологий, избавляя программиста от лишнего поиска примеров кода и загрузки из них требуемых дескрипторов зависимостей (пример таких дескрипторов и стартовых пакетов будет показан ниже)
  Если вы хотите создать Spring web-приложение, просто добавьте зависимость spring-boot-starter-web, которая подтянет в проект все библиотеки, необходимые для разработки Spring MVC-приложений, таких как spring-webmvc, jackson-json, validation-api и Tomcat
  Другими словами, Spring Boot собирает все общие зависимости и определяет их в одном месте, что позволяет разработчикам просто использовать их, вместо того, чтобы изобретать колесо каждый раз, когда они создают новое приложение 

  Автоматическая конфигурация
  После выбора подходящего starter-пакета, Spring Boot попытается автоматически настроить Spring-приложение на основе добавленных вами jar-зависимостей.
  Например, если вы добавите Spring-boot-starter-web, Spring Boot автоматически сконфигурирует такие зарегистрированные бины, как DispatcherServlet, ResourceHandlers, MessageSource.
  Если вы не собираетесь использовать базу данных, и не предоставляете никаких подробных сведений о подключении в ручном режиме, Spring Boot автоматически настроит базу в памяти, без какой-либо дополнительной конфигурации с вашей стороны (при наличии H2 или HSQL библиотек) 
  Автоматическая конфигурация может быть полностью переопределена в любой момент с помощью пользовательских настроек

  Встроенная поддержка сервера приложений — контейнера сервлетов
  Каждое Spring Boot web-приложение включает встроенный web-сервер. Посмотрите на списокконтейнеров сервлетов, которые поддерживаются "из коробки" 
  Разработчикам теперь не надо беспокоиться о настройке контейнера сервлетов и развертывании приложения на нем. Теперь приложение может запускаться само, как исполняемый jar-файл с использованием встроенного сервера 
  Если вам нужно использовать отдельный HTTP-сервер, для этого достаточно исключить зависимости по умолчанию. Spring Boot предоставляет отдельные starter-пакеты для разных HTTP-серверов 
  Создание автономных web-приложений со встроенными серверами не только удобно для разработки, но и является допустимым решением для приложений корпоративного уровня и становится все более полезно в мире микросервисов. Возможность быстро упаковать весь сервис (например, аутентификацию пользователя) в автономном и полностью развертываемом артефакте, который также предоставляет API — делает установку и развертывание приложения значительно проще


#  Сервер баз данных Posgresql
  PostgreSQL — свободная объектно-реляционная система управления базами данных (СУБД).
  Поддержка стандартов, возможности, особенности 
  Сильными сторонами PostgreSQL считаются:
•	расширяемая система встроенных языков программирования: поддерживаются PL/pgSQL, PL/Perl, PL/Python и PL/Tcl;	дополнительно использовать PL/Java, PL/PHP, PL/Py, PL/R, PL/Ruby, PL/Scheme, PL/sh и PL/V8, а также имеется поддержка загрузки модулей расширения на языке C;
•	наследование;
•	возможность индексирования геометрических объектов и наличие базирующегося на ней расширения PostGIS;
•	встроенная поддержка слабоструктурированных данных в формате JSON с возможностью их индексации;
•	расширяемость (возможность создавать новые типы данных, типы индексов, языки программирования, модули расширения, подключать любые внешние источники данных).
  Основные возможности 
  Функции
  Функции являются блоками кода, исполняемыми на сервере, а не на клиенте БД. Хотя они могут писаться на чистом SQL, реализация дополнительной логики, например, условных переходов и циклов, выходит за рамки SQL и требует использования некоторых языковых расширений. 
  PostgreSQL допускает использование функций, возвращающих набор записей, который далее можно использовать так же, как и результат выполнения обычного запроса.
  Функции могут выполняться как с правами их создателя, так и с правами текущего пользователя.
  Иногда функции отождествляются с хранимыми процедурами, однако между этими понятиями есть различие. С девятой версии возможно написание автономных блоков, которые позволяют выполнять код на процедурных языках без написания функций, непосредственно в клиенте.
  Триггеры 
  Триггеры определяются как функции, инициируемые DML-операциями. Например, операция INSERT может запускать триггер, проверяющий добавленную запись на соответствия определённым условиям. При написании функций для триггеров могут использоваться различные языки программирования (см. выше).
  Триггеры ассоциируются с таблицами. Множественные триггеры выполняются в алфавитном порядке.
  Правила и представления 
  Механизм правил представляет собой механизм создания пользовательских обработчиков не только DML-операций, но и операции выборки. Основное отличие от механизма триггеров заключается в том, что правила срабатывают на этапе разбора запроса, до выбора оптимального плана выполнения и самого процесса выполнения. Правила позволяют переопределять поведение системы при выполнении SQL-операции к таблице. Хорошим примером является реализация механизма представлений: при создании представления создается правило, которое определяет, что вместо выполнения операции выборки к представлению система должна выполнять операцию выборки к базовой таблице/таблицам с учётом условий выборки, лежащих в основе определения представления. Для создания представлений, поддерживающих операции обновления, правила для операций вставки, изменения и удаления строк должны быть определены пользователем.
  Индексы 
  В PostgreSQL имеется поддержка индексов следующих типов: B-дерево, хеш, GiST, GIN, BRIN, Bloom. При необходимости можно создавать новые типы индексов. 
  Многоверсионность (MVCC) 
  PostgreSQL поддерживает одновременную модификацию БД несколькими пользователями с помощью механизма Multiversion Concurrency Control (MVCC). Благодаря этому соблюдаются требования ACID и практически отпадает нужда в блокировках чтения.
  Типы данных 
  PostgreSQL поддерживает большой набор встроенных типов данных:
•	Численные типы
o	Целые
o	С фиксированной точкой
o	С плавающей точкой
o	Денежный тип (отличается специальным форматом вывода, а в остальном аналогичен числам с фиксированной точкой с двумя знаками после запятой)
•	Символьные типы произвольной длины
•	Двоичные типы (включая BLOB)
•	Типы «дата/время» (полностью поддерживающие различные форматы, точность, форматы вывода, включая последние изменения в часовых поясах)
•	Булев тип
•	Перечисление
•	Геометрические примитивы
•	Сетевые типы
o	IP и IPv6-адреса
o	CIDR-формат
o	MAC-адрес
•	UUID-идентификатор
•	XML-данные
•	Массивы
•	JSON
•	Идентификаторы объектов БД
•	Псевдотипы
  Более того, пользователь может самостоятельно создавать новые требуемые ему типы и программировать для них механизмы индексирования с помощью GiST.
  Пользовательские объекты 
  PostgreSQL может быть расширен пользователем для собственных нужд практически в любом аспекте. Есть возможность добавлять собственные:
•	Преобразования типов
•	Типы данных
•	Домены (пользовательские типы с изначально наложенными ограничениями)
•	Функции (включая агрегатные)
•	Индексы
•	Операторы (включая переопределение уже существующих)
•	Процедурные языки

# Wev-сервер Apache Tomcat

  Apache Tomcat - это контейнер, который позволяет вам использовать интернет приложения такие, как Java сервлеты и JSP (серверные страницы Java). Реализует спецификацию сервлетов и спецификацию JavaServer Pages (JSP) и JavaServer Faces (JSF). Написан на языке Java. Tomcat используется в качестве самостоятельного веб-сервера, в качестве сервера контента в сочетании с веб-сервером Apache HTTP Server, а также в качестве контейнера сервлетов в серверах приложений JBoss и GlassFish.

  Разработка и поддержка Tomcat осуществляется фондом Apache Software Foundation и добровольцами. Пользователи имеют свободный доступ к исходным кодам и бинарным файлам Tomcat согласно лицензии Apache License 2.0. Номера версий Tomcat начинаются с 3.0.

  Кoмпоненты

  Начиная с Tomcat 4.x выпускается с Catalina (контейнер сервлетов), Coyote (HTTP-коннектор) и Jasper (JSP-движок).
  Catalina — контейнер сервлетов Tomcat’а, который реализует спецификацию сервлетов Servlet API. Servlet API является основой для всех остальных технологий Java, касающихся Web и дает возможность динамически генерировать любой web-контент, используя любые библиотеки, доступные для Java. Архитектором Catalina являлся Craig McClanahan.
  Coyote — компонент стека HTTP Tomcat’а, который поддерживает протокол HTTP 1.1 для веб-серверов или контейнера приложений. Coyote прослушивает входящие соединения на определённом TCP порту сервера, пересылает запросы в механизм Tomcat для обработки запросов и отправляет ответ назад запрашивающему клиенту.
  Jasper — механизм JSP Tomcat’а. Tomcat 5.x использует Jasper 2, который является реализацией спецификации JavaServer Pages 2.0 Sun Microsystems. Jasper анализирует JSP-файлы, чтобы компилировать их в Java код, как сервлеты (которые могут быть обработаны с помощью Catalina). Во время выполнения, Jasper может автоматически обнаруживать изменения JSP-файла и перекомпилировать его. В Jasper 2, были добавлены важные особенности:
1) JSP библиотеки тегов объединения - Каждый тег разметки в файле JSP обрабатывается классом обработчика тегов.
2) Объекты класса обработчика тега может быть объединены и использованы повторно в целом JSP сервлете.
3) Фоновая JSP компиляция - в то время как происходит перекомпиляция измененного JSP Java-кода, старая версия все еще доступна для серверных запросов. Старый JSP сервлет удаляется только когда новый JSP сервлет закончил перекомпиляцию.
4) Компилятор Java JDT - Jasper 2 может использовать Eclipse, JDT (Средства разработки Java) компилятор Java вместо Apache Ant Ant и JAVAC.
  Некоторые из свободных ресурсов и объединений Apache Tomcat включают Tomcatexpert.com (а SpringSource спонсорское сообщество разработчиков и операторов, которые работают с Apache Tomcat в крупномасштабных производственных средах) и Apache Tomcat Ресурсный центр MuleSoft (который имеет учебные руководства по установке, обновлению, Настройка, мониторинг, устранение неполадок и крепления различные версии Tomcat). 



# Библиотека Hibernate

  Hibernate — самая популярная реализация спецификации JPA, предназначенная для решения задач объектно-реляционного отображения (ORM). Распространяется свободно на условиях GNU Lesser General Public License.

  Основные возможности 
  Целью Hibernate является освобождение разработчика от значительного объёма сравнительно низкоуровневого программирования при работе в объектно-ориентированных средствах в реляционной базе данных. Разработчик может использовать Hibernate как в процессе проектирования системы классов и таблиц «с нуля», так и для работы с уже существующей базой данных.
    Библиотека не только решает задачу связи классов Java с таблицами базы данных (и типов данных Java с типами данных SQL), но и также предоставляет средства для автоматической генерации и обновления набора таблиц, построения запросов и обработки полученных данных и может значительно уменьшить время разработки, которое обычно тратится на ручное написание SQL- и JDBC-кода. Hibernate автоматизирует генерацию SQL-запросов и освобождает разработчика от ручной обработки результирующего набора данных и преобразования объектов, максимально облегчая перенос (портирование) приложения на любые базы данных SQL.
    Hibernate обеспечивает прозрачную поддержку сохранности данных (persistence) для «POJO» (то есть для стандартных Java-объектов); единственное строгое требование для сохраняемого класса — наличие конструктора по умолчанию (без параметров). Для корректного поведения в некоторых приложениях требуется также уделить внимание методам equals()  и hashCode().

  Mapping 
  Mapping (сопоставление, проецирование) Java-классов с таблицами базы данных осуществляется с помощью конфигурационных XML-файлов или Java-аннотаций. При использовании файла XML Hibernate может генерировать скелет исходного кода для классов длительного хранения. В этом нет необходимости, если используется аннотация. Hibernate может использовать файл XML или аннотации для поддержки схемы базы данных.
    Обеспечиваются возможности по организации отношения между классами «один-ко-многим» и «многие-ко-многим». В дополнение к управлению связями между объектами Hibernate также может управлять рефлексивными отношениями, где объект имеет связь «один-ко-многим» с другими экземплярами своего собственного типа данных.
Hibernate поддерживает отображение пользовательских типов значений. Это делает возможными такие сценарии:
•	Переопределение типа по умолчанию SQL, Hibernate выбирает при отображении столбца свойства.
•	Проецирование перечисляемого типа Java на поле БД, будто они являются обычными свойствами.
•	Проецирование одного свойства в несколько колонок.
  Персистентность 
  Коллекции объектов данных, как правило, хранятся в виде коллекций Java-объектов, таких, как набор (Set) и список (List). Поддерживаются обобщенные классы (Generics), введеные в Java 5. Hibernate может быть настроен на «ленивые» (отложенные) загрузки коллекций. 
    Связанные объекты могут быть настроены на каскадные операции. Например, родительский класс Album (музыкальный альбом) может быть настроен на каскадное сохранение и/или удаление своего потомка Track. Это может сократить время разработки и обеспечить целостность. Функция проверки изменения данных (dirty checking) позволяет избежать ненужной записи действий в базу данных, выполняя SQL-обновление только при изменении полей персистентных объектов.
    Успех библиотеки Hibernate подтолкнул JCP к разработке спецификации JDO, ставшей одной из стандартных технологий ORM на платформе JavaEE. Также Hibernate совместима с JSR-220/317 и предоставляет стандартные средства JPA.
  HQL 
  Hibernate обеспечивает использование SQL-подобного языка Hibernate Query Language (HQL), который позволяет выполнять SQL-подобные запросы, записанные рядом с объектами данных Hibernate. Запросы критериев предоставляются как Объектно-ориентированная альтернатива к HQL.
  Интеграция 
  Hibernate может использоваться как в самостоятельных приложениях Java, так и в программах Java EE, выполняемых на сервере (например, сервлет или компоненты EJB). Также он может включаться как дополнительная возможность к другим языкам программирования. Например, Adobe интегрировал Hibernate в девятую версию ColdFusion (запускаемый на серверах с поддержкой приложений J2EE) с уровнем абстракции новых функций и синтаксиса, приложенных к CFML.



# Фреймворк Bootstrap
  Bootstrap (также известен как Twitter Bootstrap) — свободный набор инструментов для создания сайтов и веб-приложений. Включает в себя HTML- и CSS-шаблоны оформления для типографики, веб-форм, кнопок, меток, блоков навигации и прочих компонентов веб-интерфейса, включая JavaScript-расширения.
Bootstrap использует современные наработки в области CSS и HTML, поэтому необходимо быть внимательным при поддержке старых браузеров.
  Основные инструменты 
•	       Сетки — заранее заданные размеры колонок, которые можно сразу же использовать, например, ширина колонки 140 px относится к классу .span2 (.col-md-2 в третьей версии фреймворка), который можно использовать в CSS-описании документа.
•	Шаблоны — фиксированный или резиновый шаблон документа.
•	Типографика — описания шрифтов, определение некоторых классов для шрифтов, таких как код, цитаты и т. п.
•	Медиа — предоставляет некоторое управление изображениями и видео.
•	Таблицы — средства оформления таблиц, вплоть до добавления функциональности сортировки.
•	Формы — классы для оформления форм и некоторых событий, происходящих с ними.
•	Навигация — классы оформления для панелей, вкладок, перехода по страницам, меню и панели инструментов.
•	Алерты — оформление диалоговых окон, подсказок и всплывающих окон.


# Использование классов
Диаграмма всего проекта

<img width="468" alt="diagram" src="https://user-images.githubusercontent.com/47858531/83950072-a64a3880-a830-11ea-90e8-7c9b08dcb473.png">


В проекте определены 3 класса контроллера с помощью которых осуществляться запросы клиента.
HomeController
Класс в котором осуществляться контроль логгирования и начальной страницы сайта.
	ProductController
Класс в котором осуществляться контроль списка продуктов и страницы с подробной информацией товара.
RegisterController
	Класс в котором осуществляться контроль регистрации нового пользователя.
	package kh.com.duende.dao

		В этом пакете определенны два интерфейса:

	CustomerDao
	ProductDao

		И их реализация в классах:

	package kh.com.duende.dao.impl
	CustomerDaoImpl
	ProductDaoImpl

	Данный пакет предназначен для реализации логики       манипулирования пользователями и продуктами.

	

	package kh.com.duende.model

		В данном пакете определены все необходимые модели.

	Authorities
		Модель авторизации пользователей.	
	BillingAdress

		Модель адреса выставления счета.
	Customer

		Модель регистрации потребителя.
	Product

		Модель списка продуктов.
	ShippingAdress

		Модель адреса доставки.
	Users
		Модель пользователя.


	package kh.com.duende.service

		В этом пакете определенны два интерфейса:

	CustomerService
	ProductService

		И их реализация в классах:

	package kh.com.duende.service.impl;
	CustomerServiceImpl
	ProductServiceImpl

		

  








# Методика работы с полученной программой 

Начальное окно программы состоит из заголовка сайта, короткой информации, кнопки для получения дополнительной информации. Также вверху можно увидеть две кнопки для регистрации и логина.

<img width="444" alt="example1" src="https://user-images.githubusercontent.com/47858531/83950082-b19d6400-a830-11ea-8344-5d7fd2b9d029.png">

 
При нажатии кнопки дополнительной информации, мы попадаем в описание данного онлайн магазина. Тут мы видим две кнопки. Кнопка для связи с менеджерами сайта и кнопка для получения списка
доступных для покупки продуктов, предоставляемых магазином. 

<img width="444" alt="example2" src="https://user-images.githubusercontent.com/47858531/83950084-b3ffbe00-a830-11ea-9a08-57f56cf38637.png">

Спускаясь вниз, мы видим слайдер с различными фотографиями продуктов. 

<img width="468" alt="example3" src="https://user-images.githubusercontent.com/47858531/83950096-c679f780-a830-11ea-9e9a-01945dab18e9.png">

В самом низу страницы мы видим способы связи с менеджерами сайта. 

<img width="468" alt="example4" src="https://user-images.githubusercontent.com/47858531/83950097-c7ab2480-a830-11ea-9fc2-4e325fc0f416.png">




Заполним  адрес для выставления счета за заказ.
  
<img width="468" alt="example6" src="https://user-images.githubusercontent.com/47858531/83950100-cc6fd880-a830-11ea-9884-04256ab1c808.png">



Заполним  адрес доставки. Нажимаем кнопку отправки.


<img width="468" alt="example7" src="https://user-images.githubusercontent.com/47858531/83950101-cd086f00-a830-11ea-962b-2e2ffc0dfc3d.png">
 
Если необходимые пункты заполненны без ошибок мы попадаем на страницу с подтверждение регитсрации нового пользователя. 
 
<img width="468" alt="example8" src="https://user-images.githubusercontent.com/47858531/83950102-cda10580-a830-11ea-875a-5b106ca76f4c.png">

Далее мы попадаем на страницу со списком доступных продуктов.  
 
<img width="468" alt="example9" src="https://user-images.githubusercontent.com/47858531/83950103-ce399c00-a830-11ea-9d39-2fec1c41bcde.png">

Нажав на продукт мы попадаем на страницу с подробным описанием выбранного товара. На данной странице находиться название, описание, производитель, категория, состояние, цена продукта. 

<img width="468" alt="example10" src="https://user-images.githubusercontent.com/47858531/83950104-ced23280-a830-11ea-8b56-1ae418f11016.png">

Нажав на картинку с товаром мы можем детальнее рассмотреть продукт.

<img width="468" alt="example11" src="https://user-images.githubusercontent.com/47858531/83950106-cf6ac900-a830-11ea-9b1f-f8467469def5.png">



При входе в аккаунт, появляется надпись с приветствием пользователя вверху сайта.

<img width="468" alt="example13" src="https://user-images.githubusercontent.com/47858531/83950111-d2fe5000-a830-11ea-8ccd-014479b2ed10.png">
  

Зарегестрированный пользователь видит на странице с продуктами 3 
кнопки для дальнейшей работы: назад, приобрести и продолжить.  

<img width="468" alt="example14" src="https://user-images.githubusercontent.com/47858531/83950112-d396e680-a830-11ea-8728-a06de0368768.png">

При нажатии кнопки назад мы попадает в главное меню онлайн магазина.  

<img width="468" alt="example15" src="https://user-images.githubusercontent.com/47858531/83950113-d396e680-a830-11ea-8a02-3d9b60d5c4ba.png">

При нажатии кнопки продолжить мы попадает на станицу со списком 
продуктов.  

<img width="468" alt="example16" src="https://user-images.githubusercontent.com/47858531/83950115-d42f7d00-a830-11ea-905e-f4692131dede.png">
