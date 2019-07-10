/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Behavioralfeature of the Data Model uml.
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
{@link concurrency}, 
{@link isAbstract}, 
{@link method}, 
{@link ownedParameter}, 
{@link ownedParameterSet}, 
{@link raisedException}, 

* It provides of then following operations (getters and setters)
{@link getConcurrency},
{@link getIsAbstract},
{@link getMethod},
{@link getOwnedParameter},
{@link getOwnedParameterSet},
{@link getRaisedException},
{@link setConcurrency},
{@link setIsAbstract},
{@link setMethod},
{@link setOwnedParameter},
{@link setOwnedParameterSet},
{@link setRaisedException},
 */

@Description("A BehavioralFeature is a feature of a Classifier that specifies an aspect of the behavior of its instances.  A BehavioralFeature is implemented (realized) by a Behavior. A BehavioralFeature specifies that a Classifier will respond to a designated request by invoking its implementing method.<p>From package UML::Classification.</p>")
 
@Abstract 

public interface Behavioralfeature extends GenericEntity, uml.Namespace, uml.Feature {

	EntityType<Behavioralfeature> T = EntityTypes.T(Behavioralfeature.class);

	/* Constants for each property name. */
	java.lang.String concurrency = "concurrency";
	java.lang.String isAbstract = "isAbstract";
	java.lang.String method = "method";
	java.lang.String ownedParameter = "ownedParameter";
	java.lang.String ownedParameterSet = "ownedParameterSet";
	java.lang.String raisedException = "raisedException";

	@Description("Specifies the semantics of concurrent calls to the same passive instance (i.e., an instance originating from a Class with isActive being false). Active instances control access to their own BehavioralFeatures.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.CallConcurrencyKind getConcurrency();
	void setConcurrency(uml.CallConcurrencyKind concurrency);
	@Description("If true, then the BehavioralFeature does not have an implementation, and one must be supplied by a more specific Classifier. If false, the BehavioralFeature must have an implementation in the Classifier or one must be inherited.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsAbstract();
	void setIsAbstract(types.Boolean isAbstract);
	@Description("A Behavior that implements the BehavioralFeature. There may be at most one Behavior for a particular pairing of a Classifier (as owner of the Behavior) and a BehavioralFeature (as specification of the Behavior).<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Behavior> getMethod();
	void setMethod(java.util.List<uml.Behavior> method);

	@Description("The ordered set of formal Parameters of this BehavioralFeature.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Parameter> getOwnedParameter();
	void setOwnedParameter(java.util.List<uml.Parameter> ownedParameter);

	@Description("The ParameterSets owned by this BehavioralFeature.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Parameterset> getOwnedParameterSet();
	void setOwnedParameterSet(java.util.List<uml.Parameterset> ownedParameterSet);

	@Description("The Types representing exceptions that may be raised during an invocation of this BehavioralFeature.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Type> getRaisedException();
	void setRaisedException(java.util.List<uml.Type> raisedException);

}
