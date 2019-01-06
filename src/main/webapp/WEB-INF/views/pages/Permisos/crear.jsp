<%-- 
    Document   : crear
    Created on : 05/01/2019, 11:46:08 PM
    Author     : Erick Chinchilla
--%>

<!-- Container fluid  -->
            <div class="container-fluid">
                <!-- Start Page Content -->
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-header"><h4 class="card-title">Crear Permiso</h4></div>
                            <form>
                            <div class="card-body"> 
                                <div class="basic-form">
                                        <div class="form-group" style="margin-top:20px;">
                                            <label>Nombre</label>
                                            <input type="text" class="form-control" placeholder="Ingrese el nombre del permiso">
                                        </div>
                                        
                                    <div class="form-group">
                                        <label>Estado</label>
                                        <div class="form-check">
                                        <input class="form-check-input" type="radio" name="estado" id="activo" value="A" checked>
                                        <label class="form-check-label" for="activo">Activo</label>
                                    </div>
                                    
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="estado" id="inactivo" value="I">
                                        <label class="form-check-label" for="inactivo">Inactivo</label>
                                    </div>
                                    </div>
                                        
                                </div>
                            </div>
                            <div class="card-footer text-right">
                                <a href="${pageContext.request.contextPath}/permisos/" class="btn btn-inverse"><i class="fa fa-close"></i> Cancelar</a>
                                <button type="submit" class="btn btn-success"> <i class="fa fa-save"></i> Guardar</button>
                            </div>
                                </form>
                        </div>
                    </div>
                </div>
                <!-- End PAge Content -->
            </div>
            <!-- End Container fluid  -->
