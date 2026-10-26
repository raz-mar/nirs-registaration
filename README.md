# nirs-registaration

## Справка по API эндпоинтам

Базовый URL для всех запросов к приложению: `http://localhost:8080/api/applications`

### 1. Создание заявки
**Эндпоинт:** `POST /create`
**Описание:** Отправляет новую заявку с заголовком и текстом тезисов.
**Запрос:**
```powershell
invoke-restmethod "http://localhost:8080/api/applications/create" -method post -contenttype "application/json" -body '{"title":"...","theses":"..."}'
```

### 2. Получение всех заявок
**Эндпоинт:** `GET /`
**Описание:** Возвращает список всех активных заявок в системе.
**Запрос:**
```powershell
invoke-restmethod "http://localhost:8080/api/applications" -method get
```

### 3. Получение заявки по ID
**Эндпоинт:** `GET /{id}`
**Описание:** Возвращает подробную информацию о конкретной заявке по её id.
**Запрос:**
```powershell
invoke-restmethod "http://localhost:8080/api/applications/..." -method get
```

### 4. Редактирование заявки
**Эндпоинт:** `PUT /{id}/edit`
**Описание:** Обновляет поля `title` и `theses` у существующей заявки.
**Запрос:**
```powershell
invoke-restmethod "http://localhost:8080/api/applications/.../edit" -method put -contenttype "application/json" -body '{"title":"...","theses":"..."}'
```

### 5. Удаление заявки
**Эндпоинт:** `DELETE /{id}`
**Описание:** Меняет статус заявки на `DELETED`.
**Запрос:**
```powershell
invoke-restmethod "http://localhost:8080/api/applications/..." -method delete
```