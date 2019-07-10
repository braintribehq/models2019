/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Qualifiervalue of the Data Model uml.
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
{@link qualifier}, 
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getQualifier},
{@link getValue},
{@link setQualifier},
{@link setValue},
 */

@Description("A QualifierValue is an Element that is used as part of LinkEndData to provide the value for a single qualifier of the end given by the LinkEndData.<p>From package UML::Actions.</p>")

public interface Qualifiervalue extends GenericEntity, uml.Element {

	EntityType<Qualifiervalue> T = EntityTypes.T(Qualifiervalue.class);

	/* Constants for each property name. */
	java.lang.String qualifier = "qualifier";
	java.lang.String value = "value";

	@Description("The qualifier Property for which the value is to be specified.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Property getQualifier();
	void setQualifier(uml.Property qualifier);
	@Description("The InputPin from which the specified value for the qualifier is taken.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getValue();
	void setValue(uml.Inputpin value);
}
