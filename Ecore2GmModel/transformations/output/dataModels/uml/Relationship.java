/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Relationship of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link relatedElement}, 

* It provides of then following operations (getters and setters)
{@link getRelatedElement},
{@link setRelatedElement},
 */

@Description("Relationship is an abstract concept that specifies some kind of relationship between Elements.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Relationship extends GenericEntity, uml.Element {

	EntityType<Relationship> T = EntityTypes.T(Relationship.class);

	/* Constants for each property name. */
	java.lang.String relatedElement = "relatedElement";

	@Description("Specifies the elements related by the Relationship.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Element> getRelatedElement();
	void setRelatedElement(java.util.List<uml.Element> relatedElement);

}
