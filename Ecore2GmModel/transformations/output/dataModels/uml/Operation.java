/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Operation of the Data Model uml.
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
{@link bodyCondition}, 
{@link class_}, 
{@link datatype}, 
{@link interface_}, 
{@link isOrdered}, 
{@link isQuery}, 
{@link isUnique}, 
{@link lower}, 
{@link postcondition}, 
{@link precondition}, 
{@link redefinedOperation}, 
{@link type}, 
{@link upper}, 

* It provides of then following operations (getters and setters)
{@link getBodyCondition},
{@link getClass_},
{@link getDatatype},
{@link getInterface_},
{@link getIsOrdered},
{@link getIsQuery},
{@link getIsUnique},
{@link getLower},
{@link getPostcondition},
{@link getPrecondition},
{@link getRedefinedOperation},
{@link getType},
{@link getUpper},
{@link setBodyCondition},
{@link setClass_},
{@link setDatatype},
{@link setInterface_},
{@link setIsOrdered},
{@link setIsQuery},
{@link setIsUnique},
{@link setLower},
{@link setPostcondition},
{@link setPrecondition},
{@link setRedefinedOperation},
{@link setType},
{@link setUpper},
 */

@Description("An Operation is a BehavioralFeature of a Classifier that specifies the name, type, parameters, and constraints for invoking an associated Behavior. An Operation may invoke both the execution of method behaviors as well as other behavioral responses. Operation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.<p>From package UML::Classification.</p>")

public interface Operation extends GenericEntity, uml.Behavioralfeature, uml.Parameterableelement, uml.Templateableelement {

	EntityType<Operation> T = EntityTypes.T(Operation.class);

	/* Constants for each property name. */
	java.lang.String bodyCondition = "bodyCondition";
	java.lang.String class_ = "class_";
	java.lang.String datatype = "datatype";
	java.lang.String interface_ = "interface_";
	java.lang.String isOrdered = "isOrdered";
	java.lang.String isQuery = "isQuery";
	java.lang.String isUnique = "isUnique";
	java.lang.String lower = "lower";
	java.lang.String postcondition = "postcondition";
	java.lang.String precondition = "precondition";
	java.lang.String redefinedOperation = "redefinedOperation";
	java.lang.String type = "type";
	java.lang.String upper = "upper";

	@Description("An optional Constraint on the result values of an invocation of this Operation.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Constraint getBodyCondition();
	void setBodyCondition(uml.Constraint bodyCondition);
	@Description("The Class that owns this operation, if any.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Class getClass_();
	void setClass_(uml.Class class_);
	@Description("The DataType that owns this Operation, if any.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Datatype getDatatype();
	void setDatatype(uml.Datatype datatype);
	@Description("The Interface that owns this Operation, if any.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Interface getInterface_();
	void setInterface_(uml.Interface interface_);
	@Description("Specifies whether the return parameter is ordered or not, if present.  This information is derived from the return result for this Operation.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsOrdered();
	void setIsOrdered(types.Boolean isOrdered);
	@Description("Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged (isQuery=true) or whether side effects may occur (isQuery=false).<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsQuery();
	void setIsQuery(types.Boolean isQuery);
	@Description("Specifies whether the return parameter is unique or not, if present. This information is derived from the return result for this Operation.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Boolean getIsUnique();
	void setIsUnique(types.Boolean isUnique);
	@Description("Specifies the lower multiplicity of the return parameter, if present. This information is derived from the return result for this Operation.<p>From package UML::Classification.</p>")
	@Mandatory
	types.Integer getLower();
	void setLower(types.Integer lower);
	@Description("An optional set of Constraints specifying the state of the system when the Operation is completed.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Constraint> getPostcondition();
	void setPostcondition(java.util.List<uml.Constraint> postcondition);

	@Description("An optional set of Constraints on the state of the system when the Operation is invoked.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Constraint> getPrecondition();
	void setPrecondition(java.util.List<uml.Constraint> precondition);

	@Description("The Operations that are redefined by this Operation.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Operation> getRedefinedOperation();
	void setRedefinedOperation(java.util.List<uml.Operation> redefinedOperation);

	@Description("The return type of the operation, if present. This information is derived from the return result for this Operation.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Type getType();
	void setType(uml.Type type);
	@Description("The upper multiplicity of the return parameter, if present. This information is derived from the return result for this Operation.<p>From package UML::Classification.</p>")
	@Mandatory
	types.UnlimitedNatural getUpper();
	void setUpper(types.UnlimitedNatural upper);
}
