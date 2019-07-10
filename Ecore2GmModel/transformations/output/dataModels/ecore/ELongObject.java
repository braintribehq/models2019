/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ELongObject.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
Template: EDataType2GmEntityType.egl
*/

package ecore;


import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;
/**
 * @author luca.berardinelli
 */



@Description("")
public interface ELongObject extends GenericEntity{

	EntityType<ELongObject> T = EntityTypes.T(ELongObject.class);


	java.lang.Long getValue();
	void setValue(java.lang.Long value);
	
}

//org.eclipse.emf.ecore.impl.EDataTypeImpl@1ec458ca (name: ELongObject) (instanceClassName: java.lang.Long) (serializable: true)
//ELong:Object
//ELong
//java.lang.Long
//java.lang.Long
//
//

