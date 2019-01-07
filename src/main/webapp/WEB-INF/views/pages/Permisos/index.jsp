<%-- 
    Document   : permisosLista
    Created on : 05/01/2019, 11:22:03 PM
    Author     : Erick Chinchilla
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!-- Container fluid  -->
            <div class="container-fluid">
                <!-- Start Page Content -->
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="card-title">
                                    <h4>Mantenimiento Permisos</h4>
                                    <a href="${pageContext.request.contextPath}/permisos/crear" class="btn btn-primary btn-flat btn-rounded btn-addon m-b-10 m-l-5 pull-right"><i class="ti-plus"></i> Nuevo</a>
                                </div>
                                <h6 class="card-subtitle">Listado de Todos los Permisos Registrados en el Sistema.</h6>
                            </div>
                            
                            
                            
                            
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table id="example23" class="display table table-hover table-striped " cellspacing="0" width="100%">
                                        <thead>
                                            <tr>
                                                <th>Nombre</th>
                                                <th>Estado</th>
                                                <th>Acciones</th>
                                            </tr>
                                        </thead>
                                        
                                        <tbody>
                                            <c:forEach var="permiso" items="${permisos}">  
                                            <tr>
                                                <td>${permiso.getNombre()}</td>
                                                <td>${permiso.getEstado()}</td>
                                                <td>
                                                    <a href="${pageContext.request.contextPath}/permisos/modificar/${permiso.getIdPermiso()}" class="btn btn-outline-success btn-flat btn-addon btn-rounded btn-sm m-b-10 m-l-5"><i class="ti-pencil"></i></a>
                                                    <a href="${pageContext.request.contextPath}/permisos/detalles/${permiso.getIdPermiso()}" class="btn btn-outline-info btn-flat btn-addon btn-rounded btn-sm m-b-10 m-l-5"><i class="ti-info-alt"></i></a>
                                                    <a href="${pageContext.request.contextPath}/permisos/eliminar/${permiso.getIdPermiso()}" class="btn btn-outline-danger btn-flat btn-addon btn-rounded btn-sm m-b-10 m-l-5"><i class="ti-trash"></i></a>
                                                </td>
                                            </tr>
                                            </c:forEach> 
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                <!-- End PAge Content -->
            </div>
            <!-- End Container fluid  -->
