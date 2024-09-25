@echo off

REM Получаем текущую дату и время в формате день-месяц-год час:минуты
for /f "tokens=2 delims==" %%i in ('wmic os get localdatetime /value') do set datetime=%%i
set year=%datetime:~0,4%
set month=%datetime:~4,2%
set day=%datetime:~6,2%
set hour=%datetime:~8,2%
set minute=%datetime:~10,2%
set formattedDate=%day%-%month%-%year% %hour%:%minute%

REM Git команды
git pull origin main
git add .
git commit -m "%formattedDate%"
git push origin main
