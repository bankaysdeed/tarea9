package managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Departamento;
import service.DepartamentoService;

@ManagedBean
@SessionScoped
public class DepartamentoManagedBean {

	@ManagedProperty(value = "#{departamentoService}")
	private DepartamentoService departamentoService;

	public DepartamentoService getDepartamentoService() {
		return departamentoService;
	}

	public void setDepartamentoService(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}
	
	
	
	private Departamento departamento = new Departamento();
	
    public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	public String registrar(){
		departamentoService.getDepartamentoRepository().save(departamento);
		return null;
	}

}

