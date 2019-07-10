/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EModelElement of the Data Model ecore.
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
{@link eAnnotations}, 

* It provides of then following operations (getters and setters)
{@link getEAnnotations},
{@link setEAnnotations},
 */

@Description("")
 
@Abstract 

public interface EModelElement extends GenericEntity, ecore.EObject {

	EntityType<EModelElement> T = EntityTypes.T(EModelElement.class);

	/* Constants for each property name. */
	java.lang.String eAnnotations = "eAnnotations";

	@Description("")
	
	java.util.List<ecore.EAnnotation> getEAnnotations();
	void setEAnnotations(java.util.List<ecore.EAnnotation> eAnnotations);

}
