/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Exceptionhandler of the Data Model uml.
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
{@link exceptionInput}, 
{@link exceptionType}, 
{@link handlerBody}, 
{@link protectedNode}, 

* It provides of then following operations (getters and setters)
{@link getExceptionInput},
{@link getExceptionType},
{@link getHandlerBody},
{@link getProtectedNode},
{@link setExceptionInput},
{@link setExceptionType},
{@link setHandlerBody},
{@link setProtectedNode},
 */

@Description("An ExceptionHandler is an Element that specifies a handlerBody ExecutableNode to execute in case the specified exception occurs during the execution of the protected ExecutableNode.<p>From package UML::Activities.</p>")

public interface Exceptionhandler extends GenericEntity, uml.Element {

	EntityType<Exceptionhandler> T = EntityTypes.T(Exceptionhandler.class);

	/* Constants for each property name. */
	java.lang.String exceptionInput = "exceptionInput";
	java.lang.String exceptionType = "exceptionType";
	java.lang.String handlerBody = "handlerBody";
	java.lang.String protectedNode = "protectedNode";

	@Description("An ObjectNode within the handlerBody. When the ExceptionHandler catches an exception, the exception token is placed on this ObjectNode, causing the handlerBody to execute.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Objectnode getExceptionInput();
	void setExceptionInput(uml.Objectnode exceptionInput);
	@Description("The Classifiers whose instances the ExceptionHandler catches as exceptions. If an exception occurs whose type is any exceptionType, the ExceptionHandler catches the exception and executes the handlerBody.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Classifier> getExceptionType();
	void setExceptionType(java.util.List<uml.Classifier> exceptionType);

	@Description("An ExecutableNode that is executed if the ExceptionHandler catches an exception.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Executablenode getHandlerBody();
	void setHandlerBody(uml.Executablenode handlerBody);
	@Description("The ExecutableNode protected by the ExceptionHandler. If an exception propagates out of the protectedNode and has a type matching one of the exceptionTypes, then it is caught by this ExceptionHandler.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Executablenode getProtectedNode();
	void setProtectedNode(uml.Executablenode protectedNode);
}
