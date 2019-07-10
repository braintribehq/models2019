/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EOperation of the Data Model ecore.
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
{@link eContainingClass}, 
{@link eTypeParameters}, 
{@link eParameters}, 
{@link eExceptions}, 
{@link eGenericExceptions}, 

* It provides of then following operations (getters and setters)
{@link getEContainingClass},
{@link getETypeParameters},
{@link getEParameters},
{@link getEExceptions},
{@link getEGenericExceptions},
{@link setEContainingClass},
{@link setETypeParameters},
{@link setEParameters},
{@link setEExceptions},
{@link setEGenericExceptions},
 */

@Description("")

public interface EOperation extends GenericEntity, ecore.ETypedElement {

	EntityType<EOperation> T = EntityTypes.T(EOperation.class);

	/* Constants for each property name. */
	java.lang.String eContainingClass = "eContainingClass";
	java.lang.String eTypeParameters = "eTypeParameters";
	java.lang.String eParameters = "eParameters";
	java.lang.String eExceptions = "eExceptions";
	java.lang.String eGenericExceptions = "eGenericExceptions";

	@Description("")
	@Mandatory
	ecore.EClass getEContainingClass();
	void setEContainingClass(ecore.EClass eContainingClass);
	@Description("")
	
	java.util.List<ecore.ETypeParameter> getETypeParameters();
	void setETypeParameters(java.util.List<ecore.ETypeParameter> eTypeParameters);

	@Description("")
	
	java.util.List<ecore.EParameter> getEParameters();
	void setEParameters(java.util.List<ecore.EParameter> eParameters);

	@Description("")
	
	java.util.List<ecore.EClassifier> getEExceptions();
	void setEExceptions(java.util.List<ecore.EClassifier> eExceptions);

	@Description("")
	
	java.util.List<ecore.EGenericType> getEGenericExceptions();
	void setEGenericExceptions(java.util.List<ecore.EGenericType> eGenericExceptions);

}
