﻿///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
using System.Drawing;
using System.Threading;
using WinForms = System.Windows.Forms;

using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Testing;
using Ranorex.Core.Repository;

namespace Test.androidTest
{
#pragma warning disable 0436 //(CS0436) The type 'type' in 'assembly' conflicts with the imported type 'type2' in 'assembly'. Using the type defined in 'assembly'.
    /// <summary>
    ///The UnhandledExceptionTest recording.
    /// </summary>
    [TestModule("44217657-88a1-45fa-ad04-e3816f8dc12b", ModuleType.Recording, 1)]
    public partial class UnhandledExceptionTest : ITestModule
    {
        /// <summary>
        /// Holds an instance of the Test.TestRepository repository.
        /// </summary>
        public static Test.TestRepository repo = Test.TestRepository.Instance;

        static UnhandledExceptionTest instance = new UnhandledExceptionTest();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public UnhandledExceptionTest()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static UnhandledExceptionTest Instance
        {
            get { return instance; }
        }

#region Variables

#endregion

        /// <summary>
        /// Starts the replay of the static recording <see cref="Instance"/>.
        /// </summary>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.0")]
        public static void Start()
        {
            TestModuleRunner.Run(Instance);
        }

        /// <summary>
        /// Performs the playback of actions in this recording.
        /// </summary>
        /// <remarks>You should not call this method directly, instead pass the module
        /// instance to the <see cref="TestModuleRunner.Run(ITestModule)"/> method
        /// that will in turn invoke this method.</remarks>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "7.0")]
        void ITestModule.Run()
        {
            Mouse.DefaultMoveTime = 300;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 1.00;

            Init();

            Report.Log(ReportLevel.Info, "Application", "Run mobile app 'io.selendroid.testapp' on device 'USB-00f540f2c4f126d9'.", new RecordItemIndex(0));
            Host.Local.RunMobileApp("USB-00f540f2c4f126d9", "io.selendroid.testapp", true);
            Delay.Milliseconds(1000);
            
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Press to throw unhandled exception') on item 'IoSelendroidTestapp.HomeScreenActivity.ExceptionTestButton'.", repo.IoSelendroidTestapp.HomeScreenActivity.ExceptionTestButtonInfo, new RecordItemIndex(1));
            Validate.Attribute(repo.IoSelendroidTestapp.HomeScreenActivity.ExceptionTestButtonInfo, "Text", "Press to throw unhandled exception");
            Delay.Milliseconds(100);
            
            Report.Log(ReportLevel.Info, "Touch", "Touch item 'IoSelendroidTestapp.HomeScreenActivity.ExceptionTestButton' at Center", repo.IoSelendroidTestapp.HomeScreenActivity.ExceptionTestButtonInfo, new RecordItemIndex(2));
            repo.IoSelendroidTestapp.HomeScreenActivity.ExceptionTestButton.Touch();
            Delay.Milliseconds(500);
            
        }

#region Image Feature Data
#endregion
    }
#pragma warning restore 0436
}
