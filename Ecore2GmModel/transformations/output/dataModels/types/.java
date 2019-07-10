/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type UnlimitedNatural.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
Template: EDataType2GmEntityType.egl
*/

package types;


import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;
/**
 * @author luca.berardinelli
 */



@Description("UnlimitedNatural is a primitive type representing unlimited natural values.")
public interface UnlimitedNatural extends GenericEntity{

	EntityType<UnlimitedNatural> T = EntityTypes.T(UnlimitedNatural.class);


	java.lang.Integer getValue();
	void setValue(java.lang.Integer value);
	
}

//org.eclipse.emf.ecore.impl.EDataTypeImpl@720e022d (name: UnlimitedNatural) (instanceClassName: int) (serializable: true)
//
//
//int
//int
//
//

