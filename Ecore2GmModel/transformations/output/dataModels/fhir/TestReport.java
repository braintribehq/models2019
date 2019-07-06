/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestReport of the Data Model fhir.
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
{@link identifier}, 
{@link testScript}, 
{@link participant}, 
{@link setup}, 
{@link test}, 
{@link teardown}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getTestScript},
{@link getParticipant},
{@link getSetup},
{@link getTest},
{@link getTeardown},
{@link setIdentifier},
{@link setTestScript},
{@link setParticipant},
{@link setSetup},
{@link setTest},
{@link setTeardown},
 */

@Description("A summary of information based on the results of executing a TestScript.If the element is present, it must have either a @value, an @id, or extensions")

public interface TestReport extends GenericEntity, fhir.FhirDomainResource {

	EntityType<TestReport> T = EntityTypes.T(TestReport.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String testScript = "testScript";
	java.lang.String participant = "participant";
	java.lang.String setup = "setup";
	java.lang.String test = "test";
	java.lang.String teardown = "teardown";

	@Description("Identifier for the TestScript assigned for external purposes outside the context of FHIR.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Ideally this is an absolute URL that is used to identify the version-specific TestScript that was executed, matching the `TestScript.url`.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTestScript();
	void setTestScript(com.braintribe.model.generic.GenericEntity testScript);
	@Description("A participant in the test execution, either the execution engine, a client, or a server.")
	
	java.util.List<fhir.TestReportParticipant> getParticipant();
	void setParticipant(java.util.List<fhir.TestReportParticipant> participant);

	@Description("The results of the series of required setup operations before the tests were executed.")
	@Mandatory
	fhir.TestReportSetup getSetup();
	void setSetup(fhir.TestReportSetup setup);
	@Description("A test executed from the test script.")
	
	java.util.List<fhir.TestReportTest> getTest();
	void setTest(java.util.List<fhir.TestReportTest> test);

	@Description("The results of the series of operations required to clean up after all the tests were executed (successfully or otherwise).")
	@Mandatory
	fhir.TestReportTeardown getTeardown();
	void setTeardown(fhir.TestReportTeardown teardown);
}
