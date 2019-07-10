/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Loopnode of the Data Model uml.
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
{@link bodyOutput}, 
{@link bodyPart}, 
{@link decider}, 
{@link isTestedFirst}, 
{@link loopVariable}, 
{@link loopVariableInput}, 
{@link result}, 
{@link setupPart}, 
{@link test}, 

* It provides of then following operations (getters and setters)
{@link getBodyOutput},
{@link getBodyPart},
{@link getDecider},
{@link getIsTestedFirst},
{@link getLoopVariable},
{@link getLoopVariableInput},
{@link getResult},
{@link getSetupPart},
{@link getTest},
{@link setBodyOutput},
{@link setBodyPart},
{@link setDecider},
{@link setIsTestedFirst},
{@link setLoopVariable},
{@link setLoopVariableInput},
{@link setResult},
{@link setSetupPart},
{@link setTest},
 */

@Description("A LoopNode is a StructuredActivityNode that represents an iterative loop with setup, test, and body sections.<p>From package UML::Actions.</p>")

public interface Loopnode extends GenericEntity, uml.Structuredactivitynode {

	EntityType<Loopnode> T = EntityTypes.T(Loopnode.class);

	/* Constants for each property name. */
	java.lang.String bodyOutput = "bodyOutput";
	java.lang.String bodyPart = "bodyPart";
	java.lang.String decider = "decider";
	java.lang.String isTestedFirst = "isTestedFirst";
	java.lang.String loopVariable = "loopVariable";
	java.lang.String loopVariableInput = "loopVariableInput";
	java.lang.String result = "result";
	java.lang.String setupPart = "setupPart";
	java.lang.String test = "test";

	@Description("The OutputPins on Actions within the bodyPart, the values of which are moved to the loopVariable OutputPins after the completion of each execution of the bodyPart, before the next iteration of the loop begins or before the loop exits.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getBodyOutput();
	void setBodyOutput(java.util.List<uml.Outputpin> bodyOutput);

	@Description("The set of ExecutableNodes that perform the repetitive computations of the loop. The bodyPart is executed as long as the test section produces a true value.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Executablenode> getBodyPart();
	void setBodyPart(java.util.List<uml.Executablenode> bodyPart);

	@Description("An OutputPin on an Action in the test section whose Boolean value determines whether to continue executing the loop bodyPart.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getDecider();
	void setDecider(uml.Outputpin decider);
	@Description("If true, the test is performed before the first execution of the bodyPart. If false, the bodyPart is executed once before the test is performed.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsTestedFirst();
	void setIsTestedFirst(types.Boolean isTestedFirst);
	@Description("A list of OutputPins that hold the values of the loop variables during an execution of the loop. When the test fails, the values are moved to the result OutputPins of the loop.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getLoopVariable();
	void setLoopVariable(java.util.List<uml.Outputpin> loopVariable);

	@Description("A list of InputPins whose values are moved into the loopVariable Pins before the first iteration of the loop.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Inputpin> getLoopVariableInput();
	void setLoopVariableInput(java.util.List<uml.Inputpin> loopVariableInput);

	@Description("A list of OutputPins that receive the loopVariable values after the last iteration of the loop and constitute the output of the LoopNode.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getResult();
	void setResult(java.util.List<uml.Outputpin> result);

	@Description("The set of ExecutableNodes executed before the first iteration of the loop, in order to initialize values or perform other setup computations.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Executablenode> getSetupPart();
	void setSetupPart(java.util.List<uml.Executablenode> setupPart);

	@Description("The set of ExecutableNodes executed in order to provide the test result for the loop.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Executablenode> getTest();
	void setTest(java.util.List<uml.Executablenode> test);

}
