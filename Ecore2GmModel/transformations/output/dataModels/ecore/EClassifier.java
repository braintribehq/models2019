/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EClassifier of the Data Model ecore.
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
{@link instanceClassName}, 
{@link instanceClass}, 
{@link defaultValue}, 
{@link instanceTypeName}, 
{@link ePackage}, 
{@link eTypeParameters}, 

* It provides of then following operations (getters and setters)
{@link getInstanceClassName},
{@link getInstanceClass},
{@link getDefaultValue},
{@link getInstanceTypeName},
{@link getEPackage},
{@link getETypeParameters},
{@link setInstanceClassName},
{@link setInstanceClass},
{@link setDefaultValue},
{@link setInstanceTypeName},
{@link setEPackage},
{@link setETypeParameters},
 */

@Description("")
 
@Abstract 

public interface EClassifier extends GenericEntity, ecore.ENamedElement {

	EntityType<EClassifier> T = EntityTypes.T(EClassifier.class);

	/* Constants for each property name. */
	java.lang.String instanceClassName = "instanceClassName";
	java.lang.String instanceClass = "instanceClass";
	java.lang.String defaultValue = "defaultValue";
	java.lang.String instanceTypeName = "instanceTypeName";
	java.lang.String ePackage = "ePackage";
	java.lang.String eTypeParameters = "eTypeParameters";

	@Description("")
	@Mandatory
	ecore.EString getInstanceClassName();
	void setInstanceClassName(ecore.EString instanceClassName);
	@Description("")
	@Mandatory
	ecore.EJavaClass getInstanceClass();
	void setInstanceClass(ecore.EJavaClass instanceClass);
	@Description("")
	@Mandatory
	ecore.EJavaObject getDefaultValue();
	void setDefaultValue(ecore.EJavaObject defaultValue);
	@Description("")
	@Mandatory
	ecore.EString getInstanceTypeName();
	void setInstanceTypeName(ecore.EString instanceTypeName);
	@Description("")
	@Mandatory
	ecore.EPackage getEPackage();
	void setEPackage(ecore.EPackage ePackage);
	@Description("")
	
	java.util.List<ecore.ETypeParameter> getETypeParameters();
	void setETypeParameters(java.util.List<ecore.ETypeParameter> eTypeParameters);

}
