<%-- 
    Document   : detalles
    Created on : 06/01/2019, 02:36:41 AM
    Author     : Erick Chinchilla
--%>

<!-- Container fluid  -->
            <div class="container-fluid">
                <!-- Start Page Content -->
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title text-info">Detalles Permiso</h4>
                                <!-- Nav tabs -->
                                <ul class="nav nav-tabs justify-content-end" role="tablist">
                                    <li class="nav-item"> <a class="nav-link active" data-toggle="tab" href="#home8" role="tab"><span><i class="ti-home"></i> Detalle</span></a> </li>
                                    <li class="nav-item"> <a class="nav-link" data-toggle="tab" href="#profile8" role="tab"><span><i class="ti-clip"></i> Relaciones</span></a> </li>
                                </ul>
                                <!-- Tab panes -->
                                <div class="tab-content tabcontent-border">
                                    <div class="tab-pane active" id="home8" role="tabpanel">
                                        <div class="p-20">
                                            <div class="row">
                                            <div class="col-md-3 col-xs-6 b-r"> <strong>Nombre</strong>
                                                <br>
                                                <p class="text-muted">${permiso.getNombre()}</p>
                                            </div>
                                            <div class="col-md-3 col-xs-6 b-r"> <strong>Estado</strong>
                                                <br>
                                                <p class="text-muted"><span class="badge badge-success">${permiso.getEstado()}</span></p>
                                            </div>
                                            <div class="col-md-3 col-xs-6 b-r"> <strong>Modificado</strong>
                                                <br>
                                                <p class="text-muted">Administrador Sistema 7/01/2019</p>
                                            </div>
                                            <div class="col-md-3 col-xs-6"> <strong>Creado</strong>
                                                <br>
                                                <p class="text-muted">Administrador Sistema 7/01/2019</p>
                                            </div>
                                        </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane  p-20" id="profile8" role="tabpanel">2</div>
                                </div>
                            </div>
                            <div class="card-footer text-right">
                                <a href="/AdminRRHH/permisos/" class="btn btn-secondary btn-flat btn-rounded btn-addon m-b-10 m-l-5"><i class="ti-angle-left"></i> Regresar</a>
                                <a href="/AdminRRHH/permisos/modificar/${permiso.getIdPermiso()}" class="btn btn-info btn-rounded btn-addon m-b-10 m-l-5"><i class="ti-pencil"></i> Editar</a>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- End PAge Content -->
            </div>
            <!-- End Container fluid  -->
