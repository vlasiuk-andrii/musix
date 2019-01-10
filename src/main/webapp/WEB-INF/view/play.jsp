<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<head>
<script type="text/javascript">
    var id;

    function loadAudio(){

            document.getElementById("song1").src="/audio?id=1";
            document.getElementById("song2").src="/audio?id=2";

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

        <audio id="song1" src="" controls="true" >
        </audio>
        <br>
        <audio id="song2" src="" controls="true" />
        </audio>

        </div>
    </div>
</body>
</html>