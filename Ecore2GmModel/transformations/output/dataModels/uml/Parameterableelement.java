/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Parameterableelement of the Data Model uml.
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
{@link owningTemplateParameter}, 
{@link templateParameter}, 

* It provides of then following operations (getters and setters)
{@link getOwningTemplateParameter},
{@link getTemplateParameter},
{@link setOwningTemplateParameter},
{@link setTemplateParameter},
 */

@Description("A ParameterableElement is an Element that can be exposed as a formal TemplateParameter for a template, or specified as an actual parameter in a binding of a template.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Parameterableelement extends GenericEntity, uml.Element {

	EntityType<Parameterableelement> T = EntityTypes.T(Parameterableelement.class);

	/* Constants for each property name. */
	java.lang.String owningTemplateParameter = "owningTemplateParameter";
	java.lang.String templateParameter = "templateParameter";

	@Description("The formal TemplateParameter that owns this ParameterableElement.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templateparameter getOwningTemplateParameter();
	void setOwningTemplateParameter(uml.Templateparameter owningTemplateParameter);
	@Description("The TemplateParameter that exposes this ParameterableElement as a formal parameter.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templateparameter getTemplateParameter();
	void setTemplateParameter(uml.Templateparameter templateParameter);
}
