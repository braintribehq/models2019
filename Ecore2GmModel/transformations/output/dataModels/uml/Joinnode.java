/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Joinnode of the Data Model uml.
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
{@link isCombineDuplicate}, 
{@link joinSpec}, 

* It provides of then following operations (getters and setters)
{@link getIsCombineDuplicate},
{@link getJoinSpec},
{@link setIsCombineDuplicate},
{@link setJoinSpec},
 */

@Description("A JoinNode is a ControlNode that synchronizes multiple flows.<p>From package UML::Activities.</p>")

public interface Joinnode extends GenericEntity, uml.Controlnode {

	EntityType<Joinnode> T = EntityTypes.T(Joinnode.class);

	/* Constants for each property name. */
	java.lang.String isCombineDuplicate = "isCombineDuplicate";
	java.lang.String joinSpec = "joinSpec";

	@Description("Indicates whether incoming tokens having objects with the same identity are combined into one by the JoinNode.<p>From package UML::Activities.</p>")
	@Mandatory
	types.Boolean getIsCombineDuplicate();
	void setIsCombineDuplicate(types.Boolean isCombineDuplicate);
	@Description("A ValueSpecification giving the condition under which the JoinNode will offer a token on its outgoing ActivityEdge. If no joinSpec is specified, then the JoinNode will offer an outgoing token if tokens are offered on all of its incoming ActivityEdges (an 'and' condition).<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Valuespecification getJoinSpec();
	void setJoinSpec(uml.Valuespecification joinSpec);
}
