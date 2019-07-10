/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Dependency of the Data Model uml.
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
{@link client}, 
{@link supplier}, 

* It provides of then following operations (getters and setters)
{@link getClient},
{@link getSupplier},
{@link setClient},
{@link setSupplier},
 */

@Description("A Dependency is a Relationship that signifies that a single model Element or a set of model Elements requires other model Elements for their specification or implementation. This means that the complete semantics of the client Element(s) are either semantically or structurally dependent on the definition of the supplier Element(s).<p>From package UML::CommonStructure.</p>")

public interface Dependency extends GenericEntity, uml.Packageableelement, uml.Directedrelationship {

	EntityType<Dependency> T = EntityTypes.T(Dependency.class);

	/* Constants for each property name. */
	java.lang.String client = "client";
	java.lang.String supplier = "supplier";

	@Description("The Element(s) dependent on the supplier Element(s). In some cases (such as a trace Abstraction) the assignment of direction (that is, the designation of the client Element) is at the discretion of the modeler and is a stipulation.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Namedelement> getClient();
	void setClient(java.util.List<uml.Namedelement> client);

	@Description("The Element(s) on which the client Element(s) depend in some respect. The modeler may stipulate a sense of Dependency direction suitable for their domain.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Namedelement> getSupplier();
	void setSupplier(java.util.List<uml.Namedelement> supplier);

}
