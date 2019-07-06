/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestReportAction of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link operation}, 
{@link assert_}, 

* It provides of then following operations (getters and setters)
{@link getOperation},
{@link getAssert_},
{@link setOperation},
{@link setAssert_},
 */

@Description("A summary of information based on the results of executing a TestScript.")

public interface TestReportAction extends GenericEntity, fhir.BackboneElement {

	EntityType<TestReportAction> T = EntityTypes.T(TestReportAction.class);

	/* Constants for each property name. */
	java.lang.String operation = "operation";
	java.lang.String assert_ = "assert_";

	@Description("The operation performed.")
	@Mandatory
	fhir.TestReportOperation getOperation();
	void setOperation(fhir.TestReportOperation operation);
	@Description("The results of the assertion performed on the previous operations.")
	@Mandatory
	fhir.TestReportAssert getAssert_();
	void setAssert_(fhir.TestReportAssert assert_);
}