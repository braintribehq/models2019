/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ETypedElement of the Data Model ecore.
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
{@link ordered}, 
{@link unique}, 
{@link lowerBound}, 
{@link upperBound}, 
{@link many}, 
{@link required}, 
{@link eType}, 
{@link eGenericType}, 

* It provides of then following operations (getters and setters)
{@link getOrdered},
{@link getUnique},
{@link getLowerBound},
{@link getUpperBound},
{@link getMany},
{@link getRequired},
{@link getEType},
{@link getEGenericType},
{@link setOrdered},
{@link setUnique},
{@link setLowerBound},
{@link setUpperBound},
{@link setMany},
{@link setRequired},
{@link setEType},
{@link setEGenericType},
 */

@Description("")
 
@Abstract 

public interface ETypedElement extends GenericEntity, ecore.ENamedElement {

	EntityType<ETypedElement> T = EntityTypes.T(ETypedElement.class);

	/* Constants for each property name. */
	java.lang.String ordered = "ordered";
	java.lang.String unique = "unique";
	java.lang.String lowerBound = "lowerBound";
	java.lang.String upperBound = "upperBound";
	java.lang.String many = "many";
	java.lang.String required = "required";
	java.lang.String eType = "eType";
	java.lang.String eGenericType = "eGenericType";

	@Description("")
	@Mandatory
	ecore.EBoolean getOrdered();
	void setOrdered(ecore.EBoolean ordered);
	@Description("")
	@Mandatory
	ecore.EBoolean getUnique();
	void setUnique(ecore.EBoolean unique);
	@Description("")
	@Mandatory
	ecore.EInt getLowerBound();
	void setLowerBound(ecore.EInt lowerBound);
	@Description("")
	@Mandatory
	ecore.EInt getUpperBound();
	void setUpperBound(ecore.EInt upperBound);
	@Description("")
	@Mandatory
	ecore.EBoolean getMany();
	void setMany(ecore.EBoolean many);
	@Description("")
	@Mandatory
	ecore.EBoolean getRequired();
	void setRequired(ecore.EBoolean required);
	@Description("")
	@Mandatory
	ecore.EClassifier getEType();
	void setEType(ecore.EClassifier eType);
	@Description("")
	@Mandatory
	ecore.EGenericType getEGenericType();
	void setEGenericType(ecore.EGenericType eGenericType);
}
