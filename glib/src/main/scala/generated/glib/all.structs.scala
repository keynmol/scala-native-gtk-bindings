package glib
package all

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

export _root_.glib.structs.GAllocator
export _root_.glib.structs.GArray
export _root_.glib.structs.GAsyncQueue
export _root_.glib.structs.GBookmarkFile
export _root_.glib.structs.GByteArray
export _root_.glib.structs.GBytes
export _root_.glib.structs.GCache
export _root_.glib.structs.GChecksum
export _root_.glib.structs.GCompletion
export _root_.glib.structs.GCond
export _root_.glib.structs.GData
export _root_.glib.structs.GDate
export _root_.glib.structs.GDateTime
export _root_.glib.structs.GDebugKey
export _root_.glib.structs.GDir
export _root_.glib.structs.GError
export _root_.glib.structs.GHashTable
export _root_.glib.structs.GHashTableIter
export _root_.glib.structs.GHmac
export _root_.glib.structs.GHook
export _root_.glib.structs.GHookList
export _root_.glib.structs.GIOChannel
export _root_.glib.structs.GIOFuncs
export _root_.glib.structs.GKeyFile
export _root_.glib.structs.GList
export _root_.glib.structs.GLogField
export _root_.glib.structs.GMainContext
export _root_.glib.structs.GMainLoop
export _root_.glib.structs.GMappedFile
export _root_.glib.structs.GMarkupParseContext
export _root_.glib.structs.GMarkupParser
export _root_.glib.structs.GMatchInfo
export _root_.glib.structs.GMemChunk
export _root_.glib.structs.GMemVTable
export _root_.glib.structs.GNode
export _root_.glib.structs.GOnce
export _root_.glib.structs.GOptionContext
export _root_.glib.structs.GOptionEntry
export _root_.glib.structs.GOptionGroup
export _root_.glib.structs.GPatternSpec
export _root_.glib.structs.GPollFD
export _root_.glib.structs.GPrivate
export _root_.glib.structs.GPtrArray
export _root_.glib.structs.GQueue
export _root_.glib.structs.GRWLock
export _root_.glib.structs.GRand
export _root_.glib.structs.GRecMutex
export _root_.glib.structs.GRegex
export _root_.glib.structs.GRelation
export _root_.glib.structs.GSList
export _root_.glib.structs.GScanner
export _root_.glib.structs.GScannerConfig
export _root_.glib.structs.GSequence
export _root_.glib.structs.GSequenceIter
export _root_.glib.structs.GSource
export _root_.glib.structs.GSourceCallbackFuncs
export _root_.glib.structs.GSourceFuncs
export _root_.glib.structs.GSourcePrivate
export _root_.glib.structs.GStaticMutex
export _root_.glib.structs.GStaticPrivate
export _root_.glib.structs.GStaticRWLock
export _root_.glib.structs.GStaticRecMutex
export _root_.glib.structs.GString
export _root_.glib.structs.GStringChunk
export _root_.glib.structs.GStrvBuilder
export _root_.glib.structs.GTestCase
export _root_.glib.structs.GTestConfig
export _root_.glib.structs.GTestLogBuffer
export _root_.glib.structs.GTestLogMsg
export _root_.glib.structs.GTestSuite
export _root_.glib.structs.GThread
export _root_.glib.structs.GThreadFunctions
export _root_.glib.structs.GThreadPool
export _root_.glib.structs.GTimeVal
export _root_.glib.structs.GTimeZone
export _root_.glib.structs.GTimer
export _root_.glib.structs.GTrashStack
export _root_.glib.structs.GTree
export _root_.glib.structs.GTreeNode
export _root_.glib.structs.GTuples
export _root_.glib.structs.GUri
export _root_.glib.structs.GUriParamsIter
export _root_.glib.structs.GVariant
export _root_.glib.structs.GVariantBuilder
export _root_.glib.structs.GVariantDict
export _root_.glib.structs.GVariantIter
export _root_.glib.structs.GVariantType
export _root_.glib.structs._GAllocator
export _root_.glib.structs._GArray
export _root_.glib.structs._GAsyncQueue
export _root_.glib.structs._GBookmarkFile
export _root_.glib.structs._GByteArray
export _root_.glib.structs._GBytes
export _root_.glib.structs._GCache
export _root_.glib.structs._GChecksum
export _root_.glib.structs._GCompletion
export _root_.glib.structs._GCond
export _root_.glib.structs._GData
export _root_.glib.structs._GDate
export _root_.glib.structs._GDateTime
export _root_.glib.structs._GDebugKey
export _root_.glib.structs._GDir
export _root_.glib.structs._GError
export _root_.glib.structs._GHashTable
export _root_.glib.structs._GHashTableIter
export _root_.glib.structs._GHmac
export _root_.glib.structs._GHook
export _root_.glib.structs._GHookList
export _root_.glib.structs._GIConv
export _root_.glib.structs._GIOChannel
export _root_.glib.structs._GIOFuncs
export _root_.glib.structs._GKeyFile
export _root_.glib.structs._GList
export _root_.glib.structs._GLogField
export _root_.glib.structs._GMainContext
export _root_.glib.structs._GMainLoop
export _root_.glib.structs._GMappedFile
export _root_.glib.structs._GMarkupParseContext
export _root_.glib.structs._GMarkupParser
export _root_.glib.structs._GMatchInfo
export _root_.glib.structs._GMemChunk
export _root_.glib.structs._GMemVTable
export _root_.glib.structs._GNode
export _root_.glib.structs._GOnce
export _root_.glib.structs._GOptionContext
export _root_.glib.structs._GOptionEntry
export _root_.glib.structs._GOptionGroup
export _root_.glib.structs._GPatternSpec
export _root_.glib.structs._GPollFD
export _root_.glib.structs._GPrivate
export _root_.glib.structs._GPtrArray
export _root_.glib.structs._GQueue
export _root_.glib.structs._GRWLock
export _root_.glib.structs._GRand
export _root_.glib.structs._GRecMutex
export _root_.glib.structs._GRegex
export _root_.glib.structs._GRelation
export _root_.glib.structs._GSList
export _root_.glib.structs._GScanner
export _root_.glib.structs._GScannerConfig
export _root_.glib.structs._GSequence
export _root_.glib.structs._GSequenceNode
export _root_.glib.structs._GSource
export _root_.glib.structs._GSourceCallbackFuncs
export _root_.glib.structs._GSourceFuncs
export _root_.glib.structs._GSourcePrivate
export _root_.glib.structs._GStaticPrivate
export _root_.glib.structs._GStaticRWLock
export _root_.glib.structs._GStaticRecMutex
export _root_.glib.structs._GString
export _root_.glib.structs._GStringChunk
export _root_.glib.structs._GStrvBuilder
export _root_.glib.structs._GThread
export _root_.glib.structs._GThreadFunctions
export _root_.glib.structs._GThreadPool
export _root_.glib.structs._GTimeVal
export _root_.glib.structs._GTimeZone
export _root_.glib.structs._GTimer
export _root_.glib.structs._GTrashStack
export _root_.glib.structs._GTree
export _root_.glib.structs._GTreeNode
export _root_.glib.structs._GTuples
export _root_.glib.structs._GUri
export _root_.glib.structs._GUriParamsIter
export _root_.glib.structs._GVariant
export _root_.glib.structs._GVariantBuilder
export _root_.glib.structs._GVariantDict
export _root_.glib.structs._GVariantIter
export _root_.glib.structs._GVariantType
