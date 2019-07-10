/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EEnumLiteral of the Data Model ecore.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ecore;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link value}, 
{@link instance}, 
{@link literal}, 
{@link eEnum}, 

* It provides of then following operations (getters and setters)
{@link getValue},
{@link getInstance},
{@link getLiteral},
{@link getEEnum},
{@link setValue},
{@link setInstance},
{@link setLiteral},
{@link setEEnum},
 */

@Description("")

public interface EEnumLiteral extends GenericEntity, ecore.ENamedElement {

	EntityType<EEnumLiteral> T = EntityTypes.T(EEnumLiteral.class);

	/* Constants for each property name. */
	java.lang.String value = "value";
	java.lang.String instance = "instance";
	java.lang.String literal = "literal";
	java.lang.String eEnum = "eEnum";

	@Description("")
	@Mandatory
	ecore.EInt getValue();
	void setValue(ecore.EInt value);
	@Description("")
	@Mandatory
	ecore.EEnumerator getInstance();
	void setInstance(ecore.EEnumerator instance);
	@Description("")
	@Mandatory
	ecore.EString getLiteral();
	void setLiteral(ecore.EString literal);
	@Description("")
	@Mandatory
	ecore.EEnum getEEnum();
	void setEEnum(ecore.EEnum eEnum);
}
