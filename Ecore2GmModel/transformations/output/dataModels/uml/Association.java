/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Association of the Data Model uml.
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
{@link endType}, 
{@link isDerived}, 
{@link memberEnd}, 
{@link ownedEnd}, 
{@link navigableOwnedEnd}, 

* It provides of then following operations (getters and setters)
{@link getEndType},
{@link getIsDerived},
{@link getMemberEnd},
{@link getOwnedEnd},
{@link getNavigableOwnedEnd},
{@link setEndType},
{@link setIsDerived},
{@link setMemberEnd},
{@link setOwnedEnd},
{@link setNavigableOwnedEnd},
 */

@Description("A link is a tuple of values that refer to typed objects.  An Association classifies a set of links, each of which is an instance of the Association.  Each value in the link refers to an instance of the type of the corresponding end of the Association.<p>From package UML::StructuredClassifiers.</p>")

public interface Association extends GenericEntity, uml.Classifier, uml.Relationship {

	EntityType<Association> T = EntityTypes.T(Association.class);

	/* Constants for each property name. */
	java.lang.String endType = "endType";
	java.lang.String isDerived = "isDerived";
	java.lang.String memberEnd = "memberEnd";
	java.lang.String ownedEnd = "ownedEnd";
	java.lang.String navigableOwnedEnd = "navigableOwnedEnd";

	@Description("The Classifiers that are used as types of the ends of the Association.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Type> getEndType();
	void setEndType(java.util.List<uml.Type> endType);

	@Description("Specifies whether the Association is derived from other model elements such as other Associations.<p>From package UML::StructuredClassifiers.</p>")
	@Mandatory
	types.Boolean getIsDerived();
	void setIsDerived(types.Boolean isDerived);
	@Description("Each end represents participation of instances of the Classifier connected to the end in links of the Association.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Property> getMemberEnd();
	void setMemberEnd(java.util.List<uml.Property> memberEnd);

	@Description("The ends that are owned by the Association itself.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Property> getOwnedEnd();
	void setOwnedEnd(java.util.List<uml.Property> ownedEnd);

	@Description("The navigable ends that are owned by the Association itself.<p>From package UML::StructuredClassifiers.</p>")
	
	java.util.List<uml.Property> getNavigableOwnedEnd();
	void setNavigableOwnedEnd(java.util.List<uml.Property> navigableOwnedEnd);

}
