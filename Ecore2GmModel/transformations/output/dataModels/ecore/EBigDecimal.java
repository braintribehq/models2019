/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EBigDecimal.
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
public interface EBigDecimal extends GenericEntity{

	EntityType<EBigDecimal> T = EntityTypes.T(EBigDecimal.class);


	java.lang.Double getValue();
	void setValue(java.lang.Double value);
	
}

//org.eclipse.emf.ecore.impl.EDataTypeImpl@22db7d0f (name: EBigDecimal) (instanceClassName: java.math.BigDecimal) (serializable: true)
//
//http://www.w3.org/2001/XMLSchema#decimal
//java.math.BigDecimal
//java.math.BigDecimal
//
//

