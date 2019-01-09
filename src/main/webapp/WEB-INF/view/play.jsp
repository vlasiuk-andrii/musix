<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<head>
<script type="text/javascript">
    function loadAudio(){
        document.getElementById("media").src="/audio";
    }
</script>
</head>

<body>
    <div>
        <div>
        <h2> This is ${message}</h2>

        Click on this <strong><a href="/">link</a></strong> to visit previous page.
        </div>
        <div align="center" width="100" height="100">
        <input id="loadList" type="button" value="Load music list" onclick="loadAudio();">
        <br>
        <br>

        <audio id="media" src="" controls="true" />

        </div>
    </div>
</body>
</html>