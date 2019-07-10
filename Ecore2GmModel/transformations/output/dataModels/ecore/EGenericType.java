/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EGenericType of the Data Model ecore.
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
{@link eUpperBound}, 
{@link eTypeArguments}, 
{@link eRawType}, 
{@link eLowerBound}, 
{@link eTypeParameter}, 
{@link eClassifier}, 

* It provides of then following operations (getters and setters)
{@link getEUpperBound},
{@link getETypeArguments},
{@link getERawType},
{@link getELowerBound},
{@link getETypeParameter},
{@link getEClassifier},
{@link setEUpperBound},
{@link setETypeArguments},
{@link setERawType},
{@link setELowerBound},
{@link setETypeParameter},
{@link setEClassifier},
 */

@Description("")

public interface EGenericType extends GenericEntity, ecore.EObject {

	EntityType<EGenericType> T = EntityTypes.T(EGenericType.class);

	/* Constants for each property name. */
	java.lang.String eUpperBound = "eUpperBound";
	java.lang.String eTypeArguments = "eTypeArguments";
	java.lang.String eRawType = "eRawType";
	java.lang.String eLowerBound = "eLowerBound";
	java.lang.String eTypeParameter = "eTypeParameter";
	java.lang.String eClassifier = "eClassifier";

	@Description("")
	@Mandatory
	ecore.EGenericType getEUpperBound();
	void setEUpperBound(ecore.EGenericType eUpperBound);
	@Description("")
	
	java.util.List<ecore.EGenericType> getETypeArguments();
	void setETypeArguments(java.util.List<ecore.EGenericType> eTypeArguments);

	@Description("")
	@Mandatory
	ecore.EClassifier getERawType();
	void setERawType(ecore.EClassifier eRawType);
	@Description("")
	@Mandatory
	ecore.EGenericType getELowerBound();
	void setELowerBound(ecore.EGenericType eLowerBound);
	@Description("")
	@Mandatory
	ecore.ETypeParameter getETypeParameter();
	void setETypeParameter(ecore.ETypeParameter eTypeParameter);
	@Description("")
	@Mandatory
	ecore.EClassifier getEClassifier();
	void setEClassifier(ecore.EClassifier eClassifier);
}
