<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
    <div>
        <div>
            <h1>This is</h1>
            <h2>${message}</h2>

            Click on this <strong><a href="/">link</a></strong> to visit previous page.
        </div>
        <div align="center" width="100" height="100">
        <input type="button" value="Load music list" onclick="alert('List loaded')">
        </div>
    </div>
</body>
</html>