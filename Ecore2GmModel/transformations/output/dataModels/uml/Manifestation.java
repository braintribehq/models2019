/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Manifestation of the Data Model uml.
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
{@link utilizedElement}, 

* It provides of then following operations (getters and setters)
{@link getUtilizedElement},
{@link setUtilizedElement},
 */

@Description("A manifestation is the concrete physical rendering of one or more model elements by an artifact.<p>From package UML::Deployments.</p>")

public interface Manifestation extends GenericEntity, uml.Abstraction {

	EntityType<Manifestation> T = EntityTypes.T(Manifestation.class);

	/* Constants for each property name. */
	java.lang.String utilizedElement = "utilizedElement";

	@Description("The model element that is utilized in the manifestation in an Artifact.<p>From package UML::Deployments.</p>")
	@Mandatory
	uml.Packageableelement getUtilizedElement();
	void setUtilizedElement(uml.Packageableelement utilizedElement);
}
