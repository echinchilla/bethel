<%-- 
    Document   : crear
    Created on : 05/01/2019, 11:46:08 PM
    Author     : Erick Chinchilla
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Container fluid  -->
            <div class="container-fluid">
                <!-- Start Page Content -->
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-header"><h4 class="card-title">Crear Permiso</h4></div>
                            <form:form method="POST" action="${pageContext.request.contextPath}/permisos/crear" modelAttribute="permiso">
                                <div class="card-body"> 
                                <div class="basic-form">
                                        <div class="form-group" style="margin-top:20px;">
                                            <label>Nombre</label>
                                            <form:input path="Nombre" type="text" class="form-control" placeholder="Ingrese el nombre del permiso" />
                                        </div>
                                        
                                    <div class="form-group">
                                        <label>Estado</label>
                                        <div class="form-check">
                                            <form:radiobutton class="form-check-input" path="Estado" id="A" value="activo"/>
                                        <label class="form-check-label" for="A">Activo</label>
                                    </div>
                                    
                                    <div class="form-check">
                                        <form:radiobutton class="form-check-input" path="Estado" id="I" value="inactivo"/>
                                        <label class="form-check-label" for="I">Inactivo</label>
                                    </div>
                                    </div>
                                        
                                </div>
                            </div>
                            <div class="card-footer text-right">
                                <a href="${pageContext.request.contextPath}/permisos/" class="btn btn-inverse"><i class="fa fa-close"></i> Cancelar</a>
                                <button type="submit" class="btn btn-success"> <i class="fa fa-save"></i> Guardar</button>
                            </div>
                                </form:form>
                        </div>
                    </div>
                </div>
                <!-- End PAge Content -->
            </div>
            <!-- End Container fluid  -->
