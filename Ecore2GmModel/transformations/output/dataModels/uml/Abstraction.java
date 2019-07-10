/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Abstraction of the Data Model uml.
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
{@link mapping}, 

* It provides of then following operations (getters and setters)
{@link getMapping},
{@link setMapping},
 */

@Description("An Abstraction is a Relationship that relates two Elements or sets of Elements that represent the same concept at different levels of abstraction or from different viewpoints.<p>From package UML::CommonStructure.</p>")

public interface Abstraction extends GenericEntity, uml.Dependency {

	EntityType<Abstraction> T = EntityTypes.T(Abstraction.class);

	/* Constants for each property name. */
	java.lang.String mapping = "mapping";

	@Description("An OpaqueExpression that states the abstraction relationship between the supplier(s) and the client(s). In some cases, such as derivation, it is usually formal and unidirectional; in other cases, such as trace, it is usually informal and bidirectional. The mapping expression is optional and may be omitted if the precise relationship between the Elements is not specified.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Opaqueexpression getMapping();
	void setMapping(uml.Opaqueexpression mapping);
}
