package DI2021.Discoteca.dao;

import java.util.List;

public interface DAO <Usuario> {	
		
	Usuario get(long id);
	    
	    List<Usuario> getAll();
	    
	    void save(Usuario t);
	    
	    void update(Usuario t);
	    
	    void delete(Usuario t);
}


