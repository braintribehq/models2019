/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EFloatObject.
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
public interface EFloatObject extends GenericEntity{

	EntityType<EFloatObject> T = EntityTypes.T(EFloatObject.class);


	java.lang.Float getValue();
	void setValue(java.lang.Float value);
	
}

//org.eclipse.emf.ecore.impl.EDataTypeImpl@67f77b71 (name: EFloatObject) (instanceClassName: java.lang.Float) (serializable: true)
//EFloat:Object
//EFloat
//java.lang.Float
//java.lang.Float
//
//

