/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Constraint of the Data Model uml.
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
{@link constrainedElement}, 
{@link context}, 
{@link specification}, 

* It provides of then following operations (getters and setters)
{@link getConstrainedElement},
{@link getContext},
{@link getSpecification},
{@link setConstrainedElement},
{@link setContext},
{@link setSpecification},
 */

@Description("A Constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an Element or set of Elements.<p>From package UML::CommonStructure.</p>")

public interface Constraint extends GenericEntity, uml.Packageableelement {

	EntityType<Constraint> T = EntityTypes.T(Constraint.class);

	/* Constants for each property name. */
	java.lang.String constrainedElement = "constrainedElement";
	java.lang.String context = "context";
	java.lang.String specification = "specification";

	@Description("The ordered set of Elements referenced by this Constraint.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Element> getConstrainedElement();
	void setConstrainedElement(java.util.List<uml.Element> constrainedElement);

	@Description("Specifies the Namespace that owns the Constraint.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Namespace getContext();
	void setContext(uml.Namespace context);
	@Description("A condition that must be true when evaluated in order for the Constraint to be satisfied.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Valuespecification getSpecification();
	void setSpecification(uml.Valuespecification specification);
}
