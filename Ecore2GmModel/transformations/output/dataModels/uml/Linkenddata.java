/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Linkenddata of the Data Model uml.
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
{@link end}, 
{@link qualifier}, 
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getEnd},
{@link getQualifier},
{@link getValue},
{@link setEnd},
{@link setQualifier},
{@link setValue},
 */

@Description("LinkEndData is an Element that identifies on end of a link to be read or written by a LinkAction. As a link (that is not a link object) cannot be passed as a runtime value to or from an Action, it is instead identified by its end objects and qualifier values, if any. A LinkEndData instance provides these values for a single Association end.<p>From package UML::Actions.</p>")

public interface Linkenddata extends GenericEntity, uml.Element {

	EntityType<Linkenddata> T = EntityTypes.T(Linkenddata.class);

	/* Constants for each property name. */
	java.lang.String end = "end";
	java.lang.String qualifier = "qualifier";
	java.lang.String value = "value";

	@Description("The Association?end?for?which?this?LinkEndData?specifies?values.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Property getEnd();
	void setEnd(uml.Property end);
	@Description("A set of QualifierValues used to provide values for the qualifiers of the end.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Qualifiervalue> getQualifier();
	void setQualifier(java.util.List<uml.Qualifiervalue> qualifier);

	@Description("The InputPin that provides the specified value for the given end. This InputPin is omitted if the LinkEndData specifies the 'open' end for a ReadLinkAction.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getValue();
	void setValue(uml.Inputpin value);
}
