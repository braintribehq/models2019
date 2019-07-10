/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EStructuralFeature of the Data Model ecore.
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
{@link changeable}, 
{@link volatile_}, 
{@link transient_}, 
{@link defaultValueLiteral}, 
{@link defaultValue}, 
{@link unsettable}, 
{@link derived}, 
{@link eContainingClass}, 

* It provides of then following operations (getters and setters)
{@link getChangeable},
{@link getVolatile_},
{@link getTransient_},
{@link getDefaultValueLiteral},
{@link getDefaultValue},
{@link getUnsettable},
{@link getDerived},
{@link getEContainingClass},
{@link setChangeable},
{@link setVolatile_},
{@link setTransient_},
{@link setDefaultValueLiteral},
{@link setDefaultValue},
{@link setUnsettable},
{@link setDerived},
{@link setEContainingClass},
 */

@Description("")
 
@Abstract 

public interface EStructuralFeature extends GenericEntity, ecore.ETypedElement {

	EntityType<EStructuralFeature> T = EntityTypes.T(EStructuralFeature.class);

	/* Constants for each property name. */
	java.lang.String changeable = "changeable";
	java.lang.String volatile_ = "volatile_";
	java.lang.String transient_ = "transient_";
	java.lang.String defaultValueLiteral = "defaultValueLiteral";
	java.lang.String defaultValue = "defaultValue";
	java.lang.String unsettable = "unsettable";
	java.lang.String derived = "derived";
	java.lang.String eContainingClass = "eContainingClass";

	@Description("")
	@Mandatory
	ecore.EBoolean getChangeable();
	void setChangeable(ecore.EBoolean changeable);
	@Description("")
	@Mandatory
	ecore.EBoolean getVolatile_();
	void setVolatile_(ecore.EBoolean volatile_);
	@Description("")
	@Mandatory
	ecore.EBoolean getTransient_();
	void setTransient_(ecore.EBoolean transient_);
	@Description("")
	@Mandatory
	ecore.EString getDefaultValueLiteral();
	void setDefaultValueLiteral(ecore.EString defaultValueLiteral);
	@Description("")
	@Mandatory
	ecore.EJavaObject getDefaultValue();
	void setDefaultValue(ecore.EJavaObject defaultValue);
	@Description("")
	@Mandatory
	ecore.EBoolean getUnsettable();
	void setUnsettable(ecore.EBoolean unsettable);
	@Description("")
	@Mandatory
	ecore.EBoolean getDerived();
	void setDerived(ecore.EBoolean derived);
	@Description("")
	@Mandatory
	ecore.EClass getEContainingClass();
	void setEContainingClass(ecore.EClass eContainingClass);
}
