<%-- 
    Document   : defaultAlerts
    Created on : 08/01/2019, 12:26:39 AM
    Author     : Erick Chinchilla
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="toast-container" class="toast-top-right">
    
    <c:forEach var="notificacion" items="${notificaciones}">
        <div class="toast ${notificacion.getEstilo()} animated zoomIn" aria-live="assertive">
                        <button type="button" class="toast-close-button" role="button" onclick="closeMessage(this.parentElement)">×</button>
                        <div class="toast-title">${notificacion.getTitulo()}</div>
                        <div class="toast-message">${notificacion.getMensaje()}</div>    
                    </div>
    </c:forEach>
    </div>

<script>
function closeMessage(content) {
    content.className = content.className.replace("zoomIn", "zoomOut");
}
</script>
